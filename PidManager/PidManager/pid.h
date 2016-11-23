#pragma once
#include <pthread.h>
#define PID_MIN  	300
#define PID_MAX 	350

int pid_map[(PID_MAX - PID_MIN + 1)];
int size = PID_MAX - PID_MIN + 1;
pthread_mutex_t mutex;

