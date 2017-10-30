package j48;
import weka.classifiers.meta.FilteredClassifier;
import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.core.converters.ArffLoader;
import weka.core.converters.ConverterUtils.DataSource;
import weka.classifiers.Evaluation;

import java.io.*;
import java.util.*;

public class j48Classifier {


	public static void main(String args[])throws Exception{
		BufferedReader reader = new BufferedReader(new FileReader("C:/Program Files/Weka-3-8/data/weather.nominal.arff"));
		Instances trainingDataSet = new Instances(reader);
		reader.close();
		trainingDataSet.setClassIndex(trainingDataSet.numAttributes() - 1);
		
//		System.out.println(trainingDataSet);
		J48 tree = new J48();
		tree.buildClassifier(trainingDataSet);
		System.out.println(tree);
		
		Evaluation eval = new Evaluation(trainingDataSet);
		eval.crossValidateModel(tree, trainingDataSet, 10, new Random(1));
		System.out.println(eval);
		

		System.out.println(eval.toSummaryString());
		System.out.println(eval.toClassDetailsString());
		System.out.println(eval.toMatrixString());
		
	
	}
}