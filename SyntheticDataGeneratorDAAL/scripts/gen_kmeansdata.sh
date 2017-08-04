parallelism=$1
outputpath=$2
samples=$3
features=$4
java -cp target/SyntheticDataGeneratorDAAL-1.0-SNAPSHOT.jar edu.indiana.ise.generator.kmeans.GenerateKMeansData ${parallelism} ${outputpath} ${samples} ${features}
