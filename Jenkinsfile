pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                javac ./Dec2Hex.java
                java ./Dec2Hex 15

            }
        }
        stage('Test') {
            steps {
                chmod +x ./test.sh
                sh ./test.shd
            }
        }
    }
}