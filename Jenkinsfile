pipeline{
	agent any
	stages	{
		stage('Build'){
			steps{
				echo 'Building'
				bat '''mvn clean install
					'''
				}
		}
		stage('Test'){
			steps{
				echo 'Testing'
				bat '''mvn sonar:sonar
					'''
			}
		}
		stage('Deploy'){
			steps{
				echo 'Deploying'
				bat '''mvn package
					'''
			}
		}
	}
}