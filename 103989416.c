#pragma once
#include <pthread.h>
#define PID_MIN  	300
#define PID_MAX 	350
#define SIZE            51

int pid_map[SIZE];

pthread_mutex_t mutex;

#include "pid.h"
#include <pthread.h>
#include <stdio.h>

/**
* Allocates the pid map.
*/
int allocate_map(void)
{
	/* create pid map */
	
	pthread_mutex_init(&mutex,NULL);
	pthread_mutex_lock(&mutex);
	int i;
	for (i = 0; i < SIZE; i++) 
	{
		pid_map[i] = 0; // availible pid map
	}
	pthread_mutex_unlock(&mutex);
	return 1;
}

/**
* Allocates a pid
*/
int allocate_pid(void)
{
	int spot_pid = -1;
	pthread_mutex_lock(&mutex);

	int j;
	for (j = 0; j < SIZE; j++) 
	{
		if (pid_map[j] == 0) 
		{
			/*Search open spot*/
			pid_map[j] = 1;
			spot_pid = j + PID_MIN;
			break;
		}
	}
	pthread_mutex_unlock(&mutex);
	// if full pid_map
	return spot_pid;
}
/**
* Releases a pid
*/
void release_pid(int pid)
{
	pthread_mutex_lock(&mutex);
	pid_map[pid - PID_MIN] = 0;
	pthread_mutex_unlock(&mutex);
}
#include <pthread.h>
#include <unistd.h>
#include <stdio.h>
#include <time.h>
#include "pid.h"

#define NUM_THREADS 100
#define ITERATIONS	10
#define SLEEP		5

/**
* mutex lock used when accessing data structure
* to ensure there are no duplicate pid's in use.
*/
pthread_mutex_t test_mutex;

void *allocator(void *param)
{
	int pid;
	int i;
	for (i = 0; i < ITERATIONS; i++) 
	{
		/*sleep*/
		sleep((int)(random() % SLEEP));

		/*allocate space for pid*/
		pthread_mutex_lock(&test_mutex);
		pid = allocate_pid();
		pthread_mutex_unlock(&test_mutex);

		if (pid == -1) 
		{
			//if pid is not available, skip
		}
		else  // if pid availible
		{
			printf("PID_%d is allocated\n", pid);
			//Sleep 
			sleep((int)(random() % SLEEP));
			/*pid release*/
			pthread_mutex_lock(&test_mutex);
			release_pid(pid);
			pthread_mutex_unlock(&test_mutex);
			printf("PID_%d is released\n", pid);
		}
	}
}

int main(void)
{
	int i;
	pthread_t tids[NUM_THREADS];
	
	pthread_mutex_init(&test_mutex, NULL);

	//Todo:
	
	/* allocate the pid map */
	allocate_map();

	/*if (allocate_map() == -1)
		return -1;*/ // did not do malloc.
	
	srand(time(NULL));
	for (i = 0; i < NUM_THREADS; i++) 
	{
		pthread_create(&(tids[i]), NULL, &allocator, NULL);
	}
	for (i = 0; i < NUM_THREADS; i++) 
	{
		pthread_join(tids[i], NULL);
	}

	printf("***DONE***\n");

	return 0;
}
