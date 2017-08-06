trainingPath=$1
samples=$2
features=$3
java -cp target/SyntheticDataGeneratorDAAL-1.0-SNAPSHOT.jar edu.indiana.ise.generator.regression.GenerateLinearRegressionSpark ${trainingPath} ${samples} ${features}
