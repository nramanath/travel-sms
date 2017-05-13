# Travel - SMS

## About
What if you are stranded elsewhere and have no access to the internet or it's limited, for various reasons, and you wish to reach your destination. Introducing Places and Directions SMS Service, the messaging service to guide with directions and nearby available places through SMS. With Places and Directions, you can request for directions from one place to another or the places nearby you. You can use it for whatever that works best for you - to ask for your favourite pizza restaurants near your location or any part of the world or you can request for directions from a valid source and destination location.

## Set up
 - Create an account in the google app engine with the free 300$ credit for one year
 - Import this project in Eclipse Mars EE IDE and install the Google Cloud Platform plugin and login to your google account with which the App Engine Account have been set up
 - Create a project and create an app engine 
 - Subscribe for Google Maps Directions and Google Maps Places API and obtain the API key and replace it in the file appengine-web.xml for the environment variables GOOGLE_MAPS_DIRECTION_API_KEY and GOOGLE_MAPS_PLACES_API_KEY
 - Create a new account in Twilio and subscribe for the Programmable SMS feature and get the credentials and a new Twilio Number and replace the values in the file appengine-web.xml for the environment variables TWILIO_ACCOUNT_SID, TWILIO_AUTH_TOKEN and TWILIO_NUMBER.
 - I have created two accounts in twilio one for Directions and Places hence the additional values TWILIO_ASU_ACCOUNT_SID_LIVE,TWILIO_ASU_AUTH_TOKEN_LIVE and TWILIO_ASU_NUMBER
 - Now after publishing the project in Google App Engine, remember to configure to web hooks for the twilio number. This web hook is the link to your API written to which Twilio will redirect each SMS request to your Web Server.

## How to Use
We have two registered twilio mobile numbers readily available; one for fetching google map directions and the other to obtain the google places, to which you can push in your SMS and receive instantaneous responses.

### 1. Twilio Google Directions Number: +1 (480) 378 6841
#### Semantics:
 - origin:<origin>, destination: <destination>, mode<mode>, avoid: <avoid>
 - <origin> - this is start location, this can be either a place or a latitude longitude
 - <destination> - this is destination location, this can be either a place or a latitude longitude
 - <mode> - travel mode, optional parameter, default value is driving
    - currently allowed values are driving, walking, bicycling, transit
 - <avoid> - restrictions that you want to add to your route, optional parameter
    - currently allowed values are tolls, highways, ferries
NOTE: Do not enter “,” (comma) for the values, and angular brackets is not required
     - Also, the messages have been logically split and will be page referenced, and the order of directions instructions is subjected to change due to the reachability of your mobile phone.

### 2. Twilio Google Places Number: +1 (623) 777 2988
#### Semantics:
 - It’s pretty straight forward, you can pretty much push any query regarding the places that you want to know, be it related to food with any specific cuisine, or a hangout place like a for a movie or an adventurous activity like hiking or skiing and you will receive the top 5 results.
### NOTE
These two numbers will not be working unless your mobile number is registered in the twilio account since it is a trail account

## Test Cases
### Directions:
 - origin: brickyard asu, destination: hayden library asu, mode: walking
 - origin: <latitude> <longitude>, destination: east vista del cerro drive
 - origin: tempe, destination: sedona, avoid: highways

### Places
 - Apple Store in Tempe
 - Libraries in asu
 - Skiing in Arizona

