# BallotProject
Create A ballot with an inputted File

USER MANUAL

Description
The program should be used to judge an election. Taking in an input file of multiple different candidates vying for an office. Then the program will tally up the votes and give out a winner as the output. Both the input and output of the program can be seen below.

How to Start Program
In the terminal you would need to access the folder “source” which contains the source code for perfect Candidate. You can do this by using the terminal command cd(change directory) foldername. Keep using that command until you are in the exctuableJar folder. Once in the excutableJar folder use the command java -jar PerfectCandidate. Read how to use program to once opened.

How to Use Program Once Opened
Once the program is found press the browse button to find your input file. Your input file must follow the input file that is shown below. Then vote on the candidates in which you think deserve votes. When done click the red button in the top corner. The final vote will come out in the output format seen bellow.

INPUT

The file will have the first line be the office that is being voted on. Second the number of candidates running for office. Then include for each candidate running have the name; party affiliation (no space in between).

EXAMPLE OF INPUT FILE

NBA Most Valuable Player Award
	3
	Lebron James;Lakers
	Stephen Curry;Warriors
	Frank Ntilikina;Knicks

OUTPUT

The output will show the award up top.  Then a line separating the results. Then each candidate’s name party and vote count will be displayed (a dash in between name and party). After the names the winner will be displayed with their name and party displayed. See example below.



EXAMPLE OUTPUT OF THE FILE

RESULTS - NBA Most Valuable Player Award

	---------------------------
	Lebron James - Lakers 			5
	Stephen Curry - Warriors 			72
	Frank Ntilikina - Knicks		        	145
	
	WINNER: Frank Ntilikina - Knicks
