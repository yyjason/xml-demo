# xml-demo
package native-image
mvn clean -DskipTests -Pnative package

run native-image
./target/xml-demo
