# ProjectAnarchy
Final Project for CS3230

Group Contract
What are we calling our project?

    Project Anarchy
    
How will we communicate?

    Slack
    
Who is the lead (and if multiple, for which parts)?

    We won't have a single lead.
    
How will we track tasks and bugs in the interface, if it is being coded by the group? Versioning?

    Slack bug channel
    
Who has the final say?

    Trevor
    
If there are problems, how do we resolve them? Who is our outside (non-peer) arbitration?

    Trevor
    
What are the code standards for the interface, how are they enforced?

    Tabs, not spaces
    Curly braces on new line.
    Importing classes

5 Message Type

    Start
    Chat
    Move
    Hit/Miss
    Win
    
When messages are sent
   
   Each client sends a Start message once the player has set their pieces.
   First player sends a Move messages to the server.
   Seconds player receives the Move message. The client determines whether it was a hit.
   Second player sends a Hit message to the server.
   First player receives Hit message and client displays a Hit or Miss prompt in the UI.
   This process continues until a user receives a Move message that causes them to lose. At this point they will send a Win message to 
   the server.
   The winning player receives a win message and the UI tells them they've won.

