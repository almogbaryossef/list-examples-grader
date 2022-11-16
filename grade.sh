# Create your grading script here

set -e

rm -rf student-submission
git clone $1 student-submission

cd student-submission

if [ -f "ListExamples.java" ]
then
    echo "file found!"
else
    echo "file does not exist!"
    exit
fi

cd ..
cp TestListExamples.java student-submission

javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar list-examples-grader/student-submission/ListExamples.java list-examples-grader/student-submission/TestListExamples.java
java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore list-examples-grader/student-submission/TestListExamples

#javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar student-submission/ListExamples.java student-submission/TestListExamples.java
#java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore student-submission/TestListExamples

