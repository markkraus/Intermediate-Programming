public class Vehicle {

	//to share PRIVATE datafields with subclasses we need to change their status to PROTECTED
	protected String model = "";
	protected int weight = 0;
	protected String color = "";
	protected double mpg = 0.0;
	protected int year = 0000;
	protected String notes = "System notes: \n";
	protected String make = "";
	protected String vclass = "";
	
	//Constructor allow us to create an OBJECT instance of our class in various ways
	public Vehicle(){
	}
	// This is also a constructor of the same name but declared differently with an ability to take in parameters. This is 'Constructor Overloading'
	public Vehicle(String inmodel,int inweight,String incolor,double inmpg,int inyear, String inmake, String invclass){
		//This constructor can take in all the needed info for a car to be defined in the line declaring the object. It will call the setters.
		setModel(inmodel);
		setWeight(inweight);
		setColor(incolor);
		setMPG(inmpg);
		setYear(inyear);
		setMake(inmake);
		setVclass(invclass);
	}

	public  void setModel(String in){
		model = in.toUpperCase();
	}

	public  String getModel(){
		//getters datatype for the method needs to match the datatype of the field it will return
		return model;

	}

	public  void setWeight(int in){
		// enforce a rule that a weight below 1000 is invalid and notify through the 'notes' field above the weight entered was invalid
		if (in < 1000)
		{
			notes += "The user entered an invalid weight of " + in + " as a weight \n";
		}
		weight = in;


	}
	public  int getWeight(){
		return weight;
	}
	public  void setColor(String in){
		color = in;
	}
	public  String getColor(){
		return color;
	}

	public  void setYear(int in){
		//make sure year isnt prior to 1930 or notify in notes an invalid year was entered
		if (in < 1930)
		{
			notes += "The user entered an invalid year of " + in +  " for vehicle model year\n";
		}
		year = in;

	}
	public  int getYear(){
		return year;
	}
	public  void setMPG(double in){
		mpg = in;
	}
	public  double getMPG(){
		return mpg;
	}
	public void setMake(String in){
		make = in.toUpperCase();
	}

	public String getMake(){
		return make;
	}

	public void setVclass(String in){
		vclass = in.toUpperCase();
	}

	public String getVclass(){
		return vclass;
	}


	public void stats(){
		System.out.println("Vehicle model name: " + model);
		System.out.println("Vehicle model year: " + year);
		System.out.println("Vehicle weight is: " + weight);
		System.out.println("Vehicle color is: " + color);
		System.out.println("Vehicle EPA rated MPG: " + mpg);
		System.out.println("Vehicle type is: " + vclass);
		System.out.println(notes);


	}






}
