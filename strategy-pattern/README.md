Strategy Pattern

The Strategy Pattern encapsulates a group of algorithms to make them interchangable.  Encapsulation also allows for modifications to be made to either group of algorithms without requiring changes to the rest of the code. 

![Image of interchangable gems for a necklace](https://user-images.githubusercontent.com/22779199/36817294-a45e41a2-1cae-11e8-9897-c4395df13b10.jpg)

My example uses two groups: TauntBehavoirs and AttackBehaviors.  

![UML for Strategy Pattern](https://user-images.githubusercontent.com/22779199/34685707-42afc408-f477-11e7-9c25-6df959995c58.png)

A RL example of this pattern would be the copy, cut, and paste options found in many GUIs.  A dev team can update how the cut option works without having to change (or risk adding bugs to) the copy and paste code.
