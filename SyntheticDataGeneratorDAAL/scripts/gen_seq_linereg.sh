trainingPath=$1
testingPath=$2
grounTruthPath=$3
samples=$2
features=$3
java -cp target/SyntheticDataGeneratorDAAL-1.0-SNAPSHOT.jar edu.indiana.ise.generator.regression.GenerateLinearRegressionDAAL ${trainingPath} ${testingPath} ${groundTruthPath} ${samples} ${features}
