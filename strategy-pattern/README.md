Strategy Pattern

The Strategy Pattern encapsulates a group of algorithms to make them interchangable.  Encapsulation also allows for modifications to be made to either group of algorithms without requiring changes to the rest of the code.  My example uses two groups: TauntBehavoirs and AttackBehaviors.  

A RL example of this pattern would be the copy, cut, and paste options found in many GUIs.  A dev team can update how the cut option works without having to change (or risk adding bugs to) the copy and paste code.

![UML for Strategy Pattern](https://user-images.githubusercontent.com/22779199/34685707-42afc408-f477-11e7-9c25-6df959995c58.png)
