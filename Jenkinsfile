pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }

        stage('Deliver') {
            steps {
                sh '/var/lib/docker/volumes/jenkins-data/_data/workspace/simple-java-maven-app/jenkins/scripts/deliver.sh'
            }
        }
    }
}
