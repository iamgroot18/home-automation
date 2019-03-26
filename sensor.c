#include<wiringPi.h>
#include<stdio.h>

int main(void)
{
	wiringPiSetup();
	pinMode (0,INPUT);
	pinMode (21,OUTPUT);
	
        
       for (;;)
       {
	       if(digitalRead(0)==1)
	       {
	          digitalWrite(21,1);
		  printf ("sensor is on\n");
       }
	       else 
	       {
		       digitalWrite(21,0);
		       printf("sensor is off\n");
	       }
       }
       return 0;
}

