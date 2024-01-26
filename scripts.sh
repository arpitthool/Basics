
#This command will list the titles of all open issues in a specific GitHub repository.
./githubapi-get.sh $GITHUBTOKEN /repos/<username>/<repository>/issues?state=open | grep '"title":'

#This command will list the login names of contributors to a specific GitHub repository.
./githubapi-get.sh $GITHUBTOKEN /repos/<username>/<repository>/contributors | grep '"login":'
