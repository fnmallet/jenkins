pipeline {
    agent any

    stages {
	    stage('Test') {
            steps {
                echo 'Testing..'
				bat 'mvn test'
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
				bat 'mvn compile'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
				bat 'mvn package'
            }
        }
    }
}