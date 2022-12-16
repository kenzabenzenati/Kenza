pipeline {
    agent any
    stages {
        stage('checkout') {
            steps{
             git branch: 'master', url: 'https://github.com/kenzabenzenati/Kenza.git'
            }  

            }
        
        stage('clean'){
            steps{
                dir ('trading'){
               bat './mvnw clean' 
              
    }
                
            }
    }
    stage('compile'){
            steps{
                dir ('trading'){
             
               bat './mvnw compile'
               
    }
                
            }
    }
    stage('test'){
            steps{
                dir ('trading'){
               
               bat './mvnw test'
               
    }
                
            }
    }
stage('sonor'){
            steps{
                dir ('trading'){
               
               bat './mvnw clean verify sonar:sonar -Dsonar.projectKey=Kenza -Dsonar.host.url=http://localhost:9000 -Dsonar.login=sqp_5a4183180c9ec5a5f5062457ea1a7d639aed8640'
               
    }
                
            }
    }

    stage('package'){
            steps{
                dir ('trading'){
              
               bat './mvnw package'
              
    }
                
            }
    }
    stage('archive'){
            steps{
                dir ('trading'){
              
               bat 'rename target\\trading-0.0.1-SNAPSHOT.jar trading-%BUILD_NUMBER%.jar'
               archiveArtifacts artifacts: 'target\\trading-*.jar', followSymlinks: false
    }
                
            }
    }
    
}
}
