package com.tw;

public class MultiplicationTable {
    String multiplicationTable = "";
    
//P:10 min
//D:22 min
//C: Much time was used to check the formatting of the output string
//A: Can clarify more in the analyzing question step before doing the actual coding
    public String createMultiplicationTable(int startNumber, int endNumber) {
        if(!isStartSmallerThanOrEqualEnd(startNumber,endNumber))
            return null;
        if(!isInRangeOf1000(startNumber,endNumber))
            return null;
        multiplicationTable = String.format(generateMultiplicationTable(startNumber, endNumber));
        return multiplicationTable;
        
    }

//P:1 min
//D:1 min
//C: The time taken is as expected.
//A: 
    public boolean isStartSmallerThanOrEqualEnd(int startNumber, int endNumber) {
        return startNumber <= endNumber;
    }

//P:1 min
//D:1 min
//C: The time taken is as expected.
//A: 
    public boolean isInRangeOf1000(int startNumber, int endNumber) {
        return (startNumber >= 1) && endNumber <= 1000;
    }

//P: 5 min
//D: 10 min
//C: Extra time was used as the requirement of the output string was not fully understood at first and I spent some time to figure out the correct way of formatting the string
//A: Make sure the requirement is fulling understood and ask for clarification if not clear
    public String generateMultiplicationTable(int startNumber, int endNumber)
    {
        for(int i = startNumber; i <= endNumber; i++) {
        	if(i != endNumber)
        		multiplicationTable += generateMultiplicationLine(startNumber,i) + "%n";
        	else multiplicationTable += generateMultiplicationLine(startNumber,i);
        }
        return multiplicationTable;
    }

//P: 5 min
//D: 10 min
//C: Extra time was used as the requirement of the output string was not fully understood at first and I spent some time to figure out the correct way of formatting the string
//A: Make sure the requirement is fulling understood and ask for clarification if not clear
    public String generateMultiplicationLine(int startNumber, int intermediate)
    {
        String line = "";
        for(int i = startNumber; i <= intermediate; i++) {
            if(i!=intermediate)
                line += i + "*" + intermediate + "=" + (i*intermediate) + "  ";
            else
                line += i + "*" + intermediate + "=" + (i*intermediate);
        }
        
        return line;
    }

}
