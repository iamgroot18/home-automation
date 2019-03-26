#include<stdio.h>
#include<string.h>
#include<errno.h>
#include<wiringSerial.h>
#include<wiringPi.h>
void main()
{	int serial_port,x=0;
	wiringPiSetup();
	pinMode(0,OUTPUT);
	pinMode(1,OUTPUT);
	pinMode(2,OUTPUT);
	pinMode(3,OUTPUT);
	digitalWrite(0,HIGH);
	digitalWrite(1,HIGH);
	digitalWrite(2,HIGH);
	digitalWrite(3,HIGH);
	char dat;
	if((serial_port=serialOpen("/dev/ttyS0",9600))<0)
	{	fprintf(stderr,"Unable to open serial device : %s \n",strerror(errno));
	}
	if(wiringPiSetup()==-1)
	{	fprintf(stdout,"unable to start wiringPi : %s \n",strerror(errno));
	}
	while(1)
	{	if(serialDataAvail(serial_port))
		{	dat=serialGetchar(serial_port);
		//	printf("%c \n",dat);
		fflush(stdout);
			//delay(1000);
		}	
		if(dat=='a')
		{	digitalWrite(0,LOW);
		//	printf("Relay A On");
		
			//delay(1000);
		}
		if(dat=='b')
		{	digitalWrite(1,LOW);
		//	printf("Relay B ON");
			//delay(1000);
			
		}
		if(dat=='c')
		{	digitalWrite(2,LOW);
		//	printf("Relay C ON");
			//delay(1000);
		}
		if(dat=='d')
		{	digitalWrite(3,LOW);
		//	printf("Relay D ON");
			//delay(1000);
		}
		if(dat=='e')
		{digitalWrite(0,HIGH);
			digitalWrite(1,HIGH);
			digitalWrite(2,HIGH);
			digitalWrite(3,HIGH);
	}	}
}
