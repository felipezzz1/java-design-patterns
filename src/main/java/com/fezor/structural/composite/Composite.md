
Composite is a structural design patter that lets you compose objects into tree structures and the work with these structures as if they were individual objects.

#### **Problem**

Using the Composite pattern makes sense onl when the core model of your app can be represented as a tree.

For example, imagine that you have two types of objects: `Products` and `Boxes`. A `Box` can contain severeal `Products` as well as a number of smaller `Boxes`. These little `Boxes` can also hold some `Products` or even smaller `Boxes`, and so on.

Say you decide to create an ordering system that uses these classes. Orders could contain simple products without an wrapping, as well as boxes stuffed with products... and other boxes. How would you determine the total price of such an order?

You could try the direct approach: unwrap all the boxes, go over all the products and then calculate the total. That would be doable in real world; but in a program, it's not as simple as running a loop. You have to know the classes of `Products` and `Boxes` you're goint through, the nesting level of the boxes and other nasty details beforehand. All of this makes the direct appoach either too awkward or even possible.


#### **Solution**

The composite pattern suggests that you work with `Products` and `Boxes` through a common interface which delcares a method for calculating the total price.

How would this method work? For a product, it'd simply return the product's price. For a box, it'd go over each item the box contains, ask its price and then return a total for this box. If one of these items were a smaller box, that box would also start going over its content and so on, until the prices of all inner components were calculated. A box could even add some extra cost to the final price, such as packaging cost.

The greatest benefit of this approach is that you don't need to care about the concrete classes of objects that compose the tree. You don't need to know whether an object is a simple product or a sophisticated box. You can treat them all the same via the common interface. When you call a method, the objects themselves pass the request down the tree.

#### **Real-World Analogy**

Armies of most countries are structured as hierarchies. An army consists of several divisions; a division is a set of brigades, and a brigade consists of platoons, which can be broken down into squads. Finally, a squad is a small group of real soldiers. Orders are given at the top of hierarchy and passed down onto each level until every soldier knows what needs to be done.

#### **Structure**

![composite.png](../../structureImages/composite.png)

1. The Component interface describes operations that are common to both simple and complex elements of the tree.
2. The Leaf is a basic element of a tree that doesn't have sub-elements.
   Usually, leaf components end up doing most of the real work, since they don't have anyone to delegate the work to.
3. The Container is an element that has sub-elements: leaves or other containers. A container doesn't know the concrete classes of its children. It works with all sub-elements only via the component interface
   Upon receiving a request, a container delegates the work to its sub-elements, processes intermediate results and then returns the final result to the client.
4. The Client works with all elements through the component interface. As a result, the client can work in the same way with both simple or complex elements of the tree.

#### **Applicability**

**Use the Composite pattern when you have to implement a tree-like object structure.**

**Use the pattern when you want the client code to treat both simple and complex elements uniformly**

#### **How to Implement**

1. Make sure that the core model of your app can be represented as a tree structure. Try to break it down into simple elements and containers. Remember that containers must be able to contain both simple elements and other containers.
2. Declare the component interface with a list of methods that make sense for both simple and complex components.
3. Create a leaf class to represent simple elements. A program may have multiple different leaf classes.
4. Create a container class to represent complex elements. In this class, provide an array field for storing references to sub-elements. The array must be able to store both leaves and containers, so make sure it's declared with the component interface type.
   While implementing the methods of the component interface, remember that a container is supposed to be delegating most of the work to sub-elements.
5. Finally, define the methods for adding and removal of child elements in the container.
   Keep in mind that these operations can be declared in the component interface. This would violate the Interface Segretation Principle because methods will be empty in the leaf class. However, the client will be able to treat all the elements equally, even when composing the tree.