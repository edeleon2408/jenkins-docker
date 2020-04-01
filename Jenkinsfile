// comment
pipeline {
 agent any
 stages {
        stage('Checkout-git-kaizen'){
             
             steps{
                echo 'Revisando repositorio del Proyecto'
					git poll: true, url: 'https://github.com/edeleon2408/jenkins-docker.git'
             }        	
        }
}
