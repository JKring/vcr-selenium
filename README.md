# Selenium Grid Hub

The Hub receives a test to be executed along with information on which browser and 'platform' where the test should be run. The hub will use this information and delegate to a node that can service those needs.

# Local

Generate the Dockerfile

    ./generate.sh 3.0.1-fermium

Build the container
  
    docker build -t vcr-selenium .
    docker run --rm -i -t --expose 4444 -p 4444:4444 -e PORT=4444 vcr-selenium


## Dockerfile

[`selenium/hub` Dockerfile](https://github.com/SeleniumHQ/docker-selenium/blob/master/Hub/Dockerfile)