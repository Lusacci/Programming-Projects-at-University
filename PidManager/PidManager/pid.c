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
	for (i = 0; i < (size); i++) 
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
	for (j = 0; j < (size); j++) 
	{
		if (pid_map[j] == 0) 
		{
			/*Search open spot*/
			pid_map[j] == 1;
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
	pid_map[pid - PID_MAX] = 0;
	pthread_mutex_unlock(&mutex);
}
