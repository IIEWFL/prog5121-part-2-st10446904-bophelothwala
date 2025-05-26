[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/ZKk74rf6)

Name: Bophelo Thwala 

 

Student No.: ST10446904 

 

Module Code: PROG5111 

 

Lecturer: Mr. Steven Ndaye 

 

PROGRAMMING 1A – POE part 1 - 2 


Chat App  

 

Part 1: User Authentication 

 

A list of options will display, you can enter a number, you can enter a number based on the options given e.g. user press 1 => 1. Register 

           Options: 

          1. Register 

          2. Login 

         3. Check Users 

        0. Exit App 

 

Picture 

 

The user has the option to exit the app by pressing 0 

 

The user has the option to press 3 to verify if any usernames were stored 

 

 

2. Registration 

 

Picture 

Picture 

 

The user will be prompted to enter user details such as (username, password and cellphone number) 

 

Measures have been placed to ensure the user cannot skip any registration steps such as 

              - Making sure the user has entered something 

                   If username == null or password == null or cellphoneNumber == null 

                        Output “Make sure you have entered all the details” 

             - Followed the username conditions (less than 5 characters and has an underscore) 

 

       - Followed the password conditions (have 8 to 16 characters, a capital letter, a number and a special character). 

      - Followed the cellphone number conditions (has an international code, no more than 10 characters). 

    

 

3. Login 

 

Picture 

The user will be prompted to enter user details used in the registration process. 

 

Measures have been placed to ensure the user cannot skip any login steps such as 

              - Making sure the user has entered something 

                    If inputUsername == null or inputPassword == null or inputCellphoneNumber == null 

                       Output “You did not enter anything” 

             - The entered username matches the registered username 

                   If inputUsername != user1.getUsername() 

                       Output “Username does not exist” 

       

             - The entered password matches the registered password. 

                   If inputUsername != user1.getPassword() 

                       Output “Incorrect password” 

 

           - The cellphone number entered matches the registered cellphone number. 

 

              If inputUsername != user1.getCellPhoneNumber() 

                       Output “Incorrect phone number” 

 

 

3. Check Users 

 

Has been added to ensure the user’s information you have registered is stored. 

 

 

Codes of the chat app poe part 1 in java is available at: 

https://github.com/IIEWFL/prog5121-part-1-st10446904-bophelothwala.git 

 

 

 

Part 2: Sending Messages 

 

After the user has logged in, you will be given three options: 

Send Messages  

Recently Sent Messages (WIP) 

Quit 

 

Picture 

 

Type on the console option 1 to send messages, type on the console option 2 to see recently sent messages, you will get the text (Coming soon...), type on the console option 3 to return to the main menu. 

 

 

 

The user can send messages by entering the phone number (It will be checked, it must be less than 12 characters, start with +27), and the message texting not exceeding 250 characters. 

 

Then, a message hash will be created to be stored, a random message ID will be generated for tracking, and both message ID and text message will be stored in an Array List. 

 

Afterwards, the user can decide to: 

Send Message – The message will be sent. 

 

Store Message – The message will be stored in an array and json file. 

 

Discard Message – The message will not be sent or stored. 

 

Continue – Continue to the sending text menu. 

 

 

Picture 

PicturePicturePicturePicture 

Codes of the chat app poe part 2 in java is available at: 

https://github.com/IIEWFL/prog5121-part-2-st10446904-bophelothwala.git 

Reference list 

 

Part 1: 

 

AI used: Claude 

 

My prompt: Can you show me an example how to check if a user has correctly followed these conditions when registering or loggin in with these conditions: Password - Must contain a capital letter, a number, a special character, cellphone number - it must start with country code in java 

 

 

Anthropic. (2025). Claude 3.7 Sonett (Feb 19 version) [Large language model]. 

https://claude.ai/new 

 

Picture 

Picture 

 

Part 2 

 

AI used: Claude 

 

My prompt: how can i store messages in a json file and what should the json file look like based on this (do not change anything in the code, just show how to store messages) 

 

Anthropic. (2025). Claude 3.7 Sonett (Feb 19 version) [Large language model]. 

 

https://claude.ai/new 
