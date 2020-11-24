package com.tw;

public class MultiplicationTable {
    String multiplicationTable = "";
    public String createMultiplicationTable(int startNumber, int endNumber) {
        if(!isStartSmallerThanOrEqualEnd(startNumber,endNumber))
            return null;
        if(!isInRangeOf1000(startNumber,endNumber))
            return null;
        multiplicationTable = String.format(generateMultiplicationTable(startNumber, endNumber));
        return multiplicationTable;
        
    }

    public boolean isStartSmallerThanOrEqualEnd(int startNumber, int endNumber) {
        return startNumber <= endNumber;
    }

    public boolean isInRangeOf1000(int startNumber, int endNumber) {
        return (startNumber >= 1) && endNumber <= 1000;
    }

    public String generateMultiplicationTable(int startNumber, int endNumber)
    {
        for(int i = startNumber; i <= endNumber; i++) {
        	if(i != endNumber)
        		multiplicationTable += generateMultiplicationLine(startNumber,i) + "%n";
        	else multiplicationTable += generateMultiplicationLine(startNumber,i);
        }
        return multiplicationTable;
    }

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
