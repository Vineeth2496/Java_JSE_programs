class Wrapper_ex
{
public static void main(String[]args)
	{
	Integer hours=24;
	Integer days=365;
	Integer year_hrs=days*hours;
	Integer weekends=96;
	Integer PublicHolydays=30;
	Integer Casual_Leave=10;
	Integer SickLeave=12;
	Integer PaidLeave=9;
	Integer Workhrs=8;
	Integer Avg_Sleephrs=8;
	Integer Fee_Time=8;
	Integer Leaves=weekends+PublicHolydays+Casual_Leave+SickLeave+PaidLeave;
	Integer WorkDays=days-Leaves;
	Integer WorkhrsYr=WorkDays*Workhrs;
	Integer SleephrsYr=days*Avg_Sleephrs;
	Integer LeavehrsYr=Leaves*Avg_Sleephrs;
	Integer Tot_Whrs=WorkDays*Workhrs;
	Integer Pvt_hrs=Leaves*hours;
	Integer Non_Whrs=WorkDays*(Avg_Sleephrs+Fee_Time);   
	Integer Tot_Pvth=Pvt_hrs+Non_Whrs;
	Integer Rem_Pvt=Tot_Pvth-SleephrsYr;
	System.out.println("\t"+"\t"+"\t"+"COMMON HUMAN BEINGS TIME SCHUDULE");
	System.out.println("\t"+"\t"+"********  AVARAGE HUMAN TIME FOR A YEAR  ********");
	System.out.println("===========================================================================");
	System.out.println("One Day				= "+hours+"   Hours");
	System.out.println("One year			= "+days+"  Days"+"\n");
	System.out.println("Hours in a year			= "+year_hrs+"  Hours"+"\n");
	System.out.println("Weekends in a year		= "+weekends+"  Days");
	System.out.println("Public Holidays in a year	= "+PublicHolydays+"  Days");
	System.out.println("Casual Leaves in a year		= "+Casual_Leave+"  Days");
	System.out.println("Sick Leaves in a year		= "+SickLeave+"  Days");
	System.out.println("Paid Leaves in a year		= "+PaidLeave+"  Days"+"\n");
	System.out.println("Avarage No.of Leaves in a year	= " +Leaves+ "  Days in year"+"\n");	
	System.out.println("Avarage Working Days in a year	= " +WorkDays+ "  Days in year"+"\n");
	System.out.println("Working Hours in a Day		= "+Workhrs+"  Hours");
	System.out.println("Sleeping Hours in a Day		= "+Avg_Sleephrs+"  Hours");
	System.out.println("Private or Free Time in a Day	= "+Fee_Time+"  Hours"+"\n");
	System.out.println("Working hours in any of your "+"\n"+" profession"+"\t"+"\t"+"\t"+" = "+WorkDays+" * "+Workhrs+" = "+Tot_Whrs+"  Hours"+"\n");
	System.out.println("Non working hours during in any "+"\n"+"of your profession"+"\t"+"\t"+" = "+WorkDays+" * "+"("+Avg_Sleephrs+" + "+Fee_Time+")"+" = "+Non_Whrs+"  Hours"+"\n");	
	System.out.println("Leaves and holidays hours in  "+"\n"+" your private life "+"\t"+"\t"+" = "+Leaves+" * "+hours+" = "+Pvt_hrs+"  Hours"+"\n");
	System.out.println("Total your private hours in a year= " + Non_Whrs + " + " + Pvt_hrs + " = " + Tot_Pvth+"  Hours"+"\n");
	System.out.println("Avarage sleeping hours of"+"\n"+"human in a year" +"\t"+"\t"+"\t"+" = " + days + " * " + Avg_Sleephrs + " = " + SleephrsYr+"  Hours"+"\n");
	System.out.println("Remaining Private time for"+"\n"+"human in a year" +"\t"+"\t"+"\t"+" = " + Tot_Pvth + " - " + SleephrsYr + " = " + Rem_Pvt+"  Hours"+"\n");
	System.out.println("===========================================================================");
	System.out.println("ACCORING TO ABOVE CALCULATION HUMAN BEINGS ARE SPENDING FOR THERE TIME FOR "+"\n"+" PROFESSION	= "+Tot_Whrs+" hours"
	+"\n"+" SLEEP TIME	= "+SleephrsYr+" hours"+"\n"+ " PRIVATE TIME	= "+Rem_Pvt+" hours"+"\n");
	System.out.println("MY CONCLUSION FOR THE TIME SCHEDULE PLEASE UTILIZE YOUR MUST VALUABLE TIME FOR"+"\n"+"\t"+"\t"+" YOUR CAREER, PASSION AND ACHIEVE YOUR GOALS"+"\n"+"\n");
	System.out.println("Thanks & Regards"+"\n"+"Vineeth");
	}
}