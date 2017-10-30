import java.io.*;
import java.util.*;
import weka.core.*;
import weka.core.converters.ArffSaver;	

public class WekaCreateARFF {
	public static void main(String args[])throws IOException{
		String fileName = "data.txt";
		String line;
		
		ArrayList<Attribute> attributes = new ArrayList<Attribute>();
		
		attributes.add(new Attribute("id"));
		attributes.add(new Attribute("name", (ArrayList<String>)null));
		attributes.add(new Attribute("political party", (ArrayList<String>)null));
		attributes.add(new Attribute("state", (ArrayList<String>)null));
		attributes.add(new Attribute("birth date",(ArrayList<String>)null));
		Instances dataSet = new Instances("SimpleARFF", attributes, 0); // The first argument is the name of the relation

		
		try{
			FileReader fileReader = new FileReader(fileName);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			ArrayList matrix = new ArrayList();
			
			while((line = bufferedReader.readLine()) != null){
				line = line.replace('\'', ' ');
				String[] items = line.split(",");
				matrix.add(Arrays.asList(items));

				
				double[] values = new double[dataSet.numAttributes()]; 
				values[0] = Double.parseDouble(items[0]);
				values[1] = dataSet.attribute(1).addStringValue(items[1]);
				values[2] = dataSet.attribute(2).addStringValue(items[2]);
				values[3] = dataSet.attribute(3).addStringValue(items[3]);
				values[4] = dataSet.attribute(4).addStringValue(items[4]);
				dataSet.add(new DenseInstance(1.0, values));
				
				
			}//end of while loop
			bufferedReader.close();
			
			System.out.println(dataSet);
			
		}
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file '" + fileName + "'");
		}
		catch(IOException ex){
			System.out.println("Error reading file '" + fileName + "'");
		}//End of Try Catch

		
	     ArffSaver arffSaverInstance = new ArffSaver(); 
	     arffSaverInstance.setInstances(dataSet); 
	     arffSaverInstance.setFile(new File("SimpleArff.arff")); 
	     arffSaverInstance.writeBatch(); 
	}//End of main
	
}//End of class
