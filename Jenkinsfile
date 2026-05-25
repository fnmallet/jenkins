pipeline {
    agent any

    stages {
	    stage('Test') {
            steps {
                echo 'Testing..'
				mvn test
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
				mvn compile
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}