trainingPath=$1
samples=$2
features=$3
classes=$4
java -cp target/SyntheticDataGeneratorDAAL-1.0-SNAPSHOT.jar edu.indiana.ise.generator.naivebayes.GenerateNaiveBayesDAAL ${trainingPath} ${samples} ${features} ${classes}
