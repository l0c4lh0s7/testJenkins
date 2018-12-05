pipeline{
	agent any
	stages	{
		stage('Build'){
			steps{
				bat echo 'Building'
				bat mvn compile
				}
		}
		stage('Test'){
			steps{
				echo 'Testing'
			}
		}
		stage('Deploy'){
			steps{
				echo 'Deploying'
			}
		}
	}
}