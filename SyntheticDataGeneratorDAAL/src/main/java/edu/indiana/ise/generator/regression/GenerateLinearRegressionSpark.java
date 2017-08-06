package edu.indiana.ise.generator.regression;

/**
 * Created by vibhatha on 8/5/17.
 */
import edu.indiana.ise.generator.util.WriteFileSingleton;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class GenerateLinearRegressionSpark{

        public static void main(String args[]) throws InterruptedException, IOException {
            if(args.length!=3){
                System.out.println("args "+args.length);
                System.out.println(args[0]+":"+args[1]+":"+args[2]);
                System.out.println("Arguments : <base-file-path> <samples> <features>");
            }
            else{
                long start_time = System.currentTimeMillis();
                System.out.println(args[0]+":"+args[1]+":"+args[2]);
                int samples = Integer.parseInt(args[1]);
                int features = Integer.parseInt(args[2]);

                String basePath = args[0];
                //generate basePath directory
                generateDirectories("data");
                generateDirectories(basePath);
                //generate the subdirectories within the basePath
                generateDirectories(basePath+"/train");

                String filepath = args[0]+"/train/"+"mat_"+samples+"_"+features;
                generateData(samples, features, filepath);
                long end_time = System.currentTimeMillis();
                System.out.println("Execution Time : "+(end_time-start_time)/1000.0+" s");
            }

        }

        public static void generateData(int samples, int features, String filename){

            try {
                Random r = new Random();
                //WriteFile writeFile = new WriteFile();
                for (int i = 0; i < samples; i++) {
                    String row ="";
                    double value = r.nextDouble();
                    for (int j = 0; j < features; j++) {
                        row += r.nextDouble()+" ";
                    }
                    String fulldata = value+","+row;
                    WriteFileSingleton.getInstance().writeToFile(filename, fulldata+" \n");
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void generateDirectories(String basePath) throws IOException {
            File file = new File(basePath);
            if (!file.exists()) {
                if (file.mkdir()) {
                    System.out.println("Directory is created!");
                } else {
                    System.out.println("Failed to create directory!");
                }
            }
        }


}
