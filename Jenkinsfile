pipeline {
    agent any

    stages {
		stage('Checkout') {
			steps { 
				echo 'Checkout'
				checkout scm
			}
		}
        stage('Build') {
            steps {
                echo 'Build'
				bat 'mvn clean compile'
            }
        }
	    stage('Test') {
            steps {
                echo 'Test'
				bat 'mvn test'
            }
        }
        stage('Package') {
            steps {
				echo 'Package'
				bat 'mvn package'
            }
        }
    }
}