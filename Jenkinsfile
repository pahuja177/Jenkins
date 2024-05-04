pipeline{

	agent any
	tools{
		maven "MAVEN"
	}
	stages
	{
	stage('Welcome Stage')
	{
		steps
		{
		 echo 'Welcome Pipeline'
		}
	}
	stage('Clean Stage')
	{
		steps
		{
		bat 'mvn clean'
		}
	}
	stage('Build Staged')
	{
		steps
		{
		 echo 'mvn install'
		}
	}
	
	}


}
