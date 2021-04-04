pipeline {
  agent any
  tools {
    maven 'Maven 3.6.3'
  }
  stages {
    stage('Build') {
      steps{
        sh 'mvn compile -f RiskMeter/pom.xml'
      } 
    }

    stage('Test') {
      steps {
        sh 'mvn test -f RiskMeter/pom.xml'
      }
    }

    stage('Deploy') {
      steps {
        echo 'Deploying....'
      }
    }

  }
}
