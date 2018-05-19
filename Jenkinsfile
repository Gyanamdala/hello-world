pipeline
{
    
    node any
    stages {
        
        stage ('Compile stage') {
                            steps {
                                withMaven (maven : 'Maven') {
                                                       sh 'mvn clean compile'
                                                   }

                            }

                        }
        stage ('Test stage') {
                            steps {
                                withMaven (maven : 'Maven') {
                                                       sh 'mvn test'
                                                   }

                            }

                        } 
         stage ('Deployment stage') {
                            steps {
                                withMaven (maven : 'Maven') {
                                                       sh 'mvn deploy'
                                                   }

                            }

                        }
    }

}