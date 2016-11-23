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
		pthread_mutex_lock(&mutex);
		pid = allocate_pid();
		pthread_mutex_unlock(&mutex);

		if (pid == -1) 
		{
			printf("No availible pid");
		}
		else  // if pid availible
		{
			printf("PID_%d is allocated\n", pid);
			//Sleep 
			sleep((int)(random() % SLEEP));
			/*pid release*/
			pthread_mutex_lock(&mutex);
			release_pid(pid);
			pthread_mutex_unlock(&mutex);
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
