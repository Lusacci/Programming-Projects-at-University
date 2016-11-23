#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <time.h>

void concat(char s1[], char s2[]);


int main(int argc, char *argv[])
{
	// Declare variables.
	pid_t pid, mychildPid, theparentPid, selfPid;
	//	char buffer[512];
	int statusCheck = 0;

	// Fork a child process.
	pid = fork();

	// If the fork fails.
	if (pid < 0)
	{
		// Print to standard error.
		fprintf(stderr, "Fork failed");
		return 1;
	}
	// If this is the child process.
	else if (pid == 0)
	{
		// Get the parent pid.
		theparentPid = getppid();
		// Get my own (child) pid.
		selfPid = getpid();
		printf(" CHILD: This is the child process.\n");
		printf("CHILD started.");
		printf(" Student Username: 103989416");
		time_t mytime;
		mytime = time(NULL);
		printf("Finish time: %s", ctime(&mytime));
		printf(" CHILD: My pid is: %d\n", selfPid); // so I can keep track.
		printf(" CHILD: My parent's pid is: %d\n", theparentPid); // will give you parent's pid.

		// If no command-line arguments are passed.
		if (argc == 1)
		{
			printf(" CHILD: Using execlp() to run 'ls -al':\n");
			execlp("ls", "ls", "-al", NULL);
		}
		// If any command-line arguments are passed.
		else if (argc == 2)
		{
			printf(" CHILD: %d argument provided. Calling execlp() to run your command in my stead.\n", (argc - 1));
			execlp(argv[1], argv[1], NULL);
		}
		else if (argc > 2)
		{
			printf(" CHILD: %d arguments provided. Calling execvp() to run your command in my stead.\n", (argc - 1));
			execvp(argv[1], argv);
		}
		else
		{
			fprintf(stderr, "Unable to determine command-line arguments.");
		}
	}
	// If this is the parent process.
	else if (pid > 0)
	{
		// Print the header.
		printf("PARENT: This program will fork() and exec().\n");
		printf("PARENT started, now waiting for process ID# %d.\n", pid);

		// Wait for the child process to complete, which will clean up the child from the process table.
		mychildPid = wait(&statusCheck);

		// Get my own pid.
		selfPid = getpid();

		if (statusCheck == 0)
		{
			printf("PARENT resumed. Child exits. Now PARENT executing...");
			printf("PARENT: Child pid %d completed with an exit code of %d.\n", mychildPid, statusCheck);
		}
		else
		{
			printf("PARENT resumed. Child exits. Now PARENT executing...");
			printf("PARENT: Child pid %d completed with an exit code of %d.\n", mychildPid, statusCheck);
		}
		printf("PARENT: My pid is: %d\n", selfPid);
		printf("PARENT: I will now terminate.\n");
	}
	// If the fork gave an unexpected error.
	else
	{
		fprintf(stderr, "Unknown error.  Check the process table.");
		return 1;
	}

	return 0;
} // End of main().


  // This will concatenate s1 and s2, putting a space between them, and leaving the result in s1.
void concat(char s1[], char s2[])
{
	int i = 0;
	int j = 0;

	for (i = 0; s1[i] != '\0'; ++i);

	for (j = 0; s2[j] != '\0'; i++, j++)
	{
		s1[i] = s2[j];
	}

	s1[i] = ' ';
	s1[i + 1] = '\0';
} // End of concat().