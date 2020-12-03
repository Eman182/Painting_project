package com.example.demo;

import org.springframework.boot.SpringApplication;
 //import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import shapescontroller.Circle;
import shapescontroller.Rectangle;
import shapescontroller.Shape;
import shapescontroller.ShapesFactory;
import shapescontroller.Square;
import shapescontroller.StackMethods;
import shapescontroller.Triangle;


@SpringBootApplication
@ComponentScan(basePackageClasses= ShapesFactory.class)
public class PainteBackEndApplication {

	public static void main(String[] args) {
		//SpringApplication.run(PainteBackEndApplication.class, args);
		
		/*Circle c = new Circle("circle",0,0,1,2,"red","10");
		System.out.println(c.id);*/
		
		/*ShapesFactory factory = new ShapesFactory();
		
		System.out.println(c1.id);*/
		
		
		ShapesFactory factory = new ShapesFactory();
		Shape c1= factory.getShape(1,"circle",3,5,3,30,"red","10",false);
		Shape c2= factory.getShape(2,"circle",3,5,3,11,"blue","10",false);
		Shape s1 = factory .getShape(3, "square", 0, 6, 8, 0, "yellow", "10",false);
		//Shape l1 = factory .getShape(4, "line", 0, 6, 2, 0, "green", "10",false);
		//Shape r1 = factory .getShape(5, "rectangle", 0, 6, 3, 0, "white", "10",false);
		//Shape e1 = factory .getShape(6, "ellipse", 0, 6, 5, 0, "pink", "10",false);
		//Shape t1 = factory .getShape(7, "triangle", 0, 6, 6, 0, "grey", "10",false);
		//System.out.println(c1.isInclude(3, 15));
		//factory.modify(3, 15, "color","green");
		System.out.println();factory.modify(3, 15, "color", "black");
		System.out.println("Stack of Shapes");
		Object[][] pointsShapes1= convertStackToArray(factory.stackshapes);

		for(int i=0 ;i<pointsShapes1.length;i++) {
			for(int j=0 ;j<pointsShapes1[0].length;j++) {
				System.out.print(pointsShapes1[i][j]+"  ");
																		
			}
			System.out.println("********");
		}
		System.out.println("Stack of steps");
		//factory.Delete(15, 20);
		/*System.out.println("After undo");*/
		Object[][] pointsShapes2= convertStackToArray(factory.stepsStack);
		for(int i=0 ;i<pointsShapes2.length;i++) {
			for(int j=0 ;j<pointsShapes2[0].length;j++) {
				System.out.print(pointsShapes2[i][j]+"  ");
																		
			}
			System.out.println("********");
		}
		
		///////////////////////
		factory.modify(3, 15, "color", "purple");
		System.out.println("Stack of Shapes");
		Object[][] pointsShapes3= convertStackToArray(factory.stackshapes);

		for(int i=0 ;i<pointsShapes3.length;i++) {
			for(int j=0 ;j<pointsShapes3[0].length;j++) {
				System.out.print(pointsShapes3[i][j]+"  ");
																		
			}
			System.out.println("********");
		}
		System.out.println("Stack of steps");
		
		Object[][] pointsShapes4= convertStackToArray(factory.stepsStack);
		for(int i=0 ;i<pointsShapes4.length;i++) {
			for(int j=0 ;j<pointsShapes4[0].length;j++) {
				System.out.print(pointsShapes4[i][j]+"  ");
																		
			}
			System.out.println("********");
		}
		
		factory.undo();
		System.out.println("After undo");
		
		System.out.println("Stack of Shapes");
		Object[][] pointsShapes10= convertStackToArray(factory.stackshapes);

		for(int i=0 ;i<pointsShapes10.length;i++) {
			for(int j=0 ;j<pointsShapes10[0].length;j++) {
				System.out.print(pointsShapes10[i][j]+"  ");
																		
			}
			System.out.println("********");
		}
		System.out.println("Stack of steps");
		
		Object[][] pointsShapes11= convertStackToArray(factory.stepsStack);
		for(int i=0 ;i<pointsShapes11.length;i++) {
			for(int j=0 ;j<pointsShapes11[0].length;j++) {
				System.out.print(pointsShapes11[i][j]+"  ");
																		
			}
			System.out.println("********");
		}
		
		System.out.println("After undo again");
		factory.undo();
		System.out.println("Stack of Shapes");
		Object[][] pointsShapes12= convertStackToArray(factory.stackshapes);

		for(int i=0 ;i<pointsShapes12.length;i++) {
			for(int j=0 ;j<pointsShapes12[0].length;j++) {
				System.out.print(pointsShapes12[i][j]+"  ");
																		
			}
			System.out.println("********");
		}
		System.out.println("Stack of steps");
		
		Object[][] pointsShapes13= convertStackToArray(factory.stepsStack);
		for(int i=0 ;i<pointsShapes13.length;i++) {
			for(int j=0 ;j<pointsShapes13[0].length;j++) {
				System.out.print(pointsShapes13[i][j]+"  ");
																		
			}
			System.out.println("********");
		}
		
		
		System.out.println("After undo again");
		factory.undo();
		System.out.println("Stack of Shapes");
		Object[][] pointsShapes14= convertStackToArray(factory.stackshapes);

		for(int i=0 ;i<pointsShapes14.length;i++) {
			for(int j=0 ;j<pointsShapes14[0].length;j++) {
				System.out.print(pointsShapes14[i][j]+"  ");
																		
			}
			System.out.println("********");
		}
		System.out.println("Stack of steps");
		
		Object[][] pointsShapes15= convertStackToArray(factory.stepsStack);
		for(int i=0 ;i<pointsShapes15.length;i++) {
			for(int j=0 ;j<pointsShapes15[0].length;j++) {
				System.out.print(pointsShapes15[i][j]+"  ");
																		
			}
			System.out.println("********");
		}
		
		
		System.out.println("After redo");
		factory.redo();
		System.out.println("Stack of Shapes");
		Object[][] pointsShapes18= convertStackToArray(factory.stackshapes);

		for(int i=0 ;i<pointsShapes18.length;i++) {
			for(int j=0 ;j<pointsShapes18[0].length;j++) {
				System.out.print(pointsShapes18[i][j]+"  ");
																		
			}
			System.out.println("********");
		}
		System.out.println("Stack of steps");
		
		Object[][] pointsShapes19= convertStackToArray(factory.stepsStack);
		for(int i=0 ;i<pointsShapes19.length;i++) {
			for(int j=0 ;j<pointsShapes19[0].length;j++) {
				System.out.print(pointsShapes19[i][j]+"  ");
																		
			}
			System.out.println("********");
		}
		
		
		
		
		System.out.println("redo again");
		factory.redo();
		pointsShapes18= convertStackToArray(factory.stackshapes);

		for(int i=0 ;i<pointsShapes18.length;i++) {
			for(int j=0 ;j<pointsShapes18[0].length;j++) {
				System.out.print(pointsShapes18[i][j]+"  ");
																		
			}
			System.out.println("********");
		}
		System.out.println("Stack of steps");
		
		pointsShapes19= convertStackToArray(factory.stepsStack);
		for(int i=0 ;i<pointsShapes19.length;i++) {
			for(int j=0 ;j<pointsShapes19[0].length;j++) {
				System.out.print(pointsShapes19[i][j]+"  ");
																		
			}
			System.out.println("********");
		}
		System.out.println("redo again"); 
		factory.redo();
		pointsShapes18= convertStackToArray(factory.stackshapes);

		for(int i=0 ;i<pointsShapes18.length;i++) {
			for(int j=0 ;j<pointsShapes18[0].length;j++) {
				System.out.print(pointsShapes18[i][j]+"  ");
																		
			}
			System.out.println("********");
		}
		System.out.println("Stack of steps");
		
		pointsShapes19= convertStackToArray(factory.stepsStack);
		for(int i=0 ;i<pointsShapes19.length;i++) {
			for(int j=0 ;j<pointsShapes19[0].length;j++) {
				System.out.print(pointsShapes19[i][j]+"  ");
																		
			}
			System.out.println("********");
		}
		System.out.println("redo again");
		//factory.redo();
		//pointsShapes18= convertStackToArray(factory.stackshapes);

		/*for(int i=0 ;i<pointsShapes18.length;i++) {
			for(int j=0 ;j<pointsShapes18[0].length;j++) {
				System.out.print(pointsShapes18[i][j]+"  ");
																		
			}
			System.out.println("********");
		}
		System.out.println("Stack of steps");
		
		 pointsShapes19= convertStackToArray(factory.stepsStack);
		for(int i=0 ;i<pointsShapes19.length;i++) {
			for(int j=0 ;j<pointsShapes19[0].length;j++) {
				System.out.print(pointsShapes19[i][j]+"  ");
																		
			}
			System.out.println("********");
		}*/
		/*factory.undo();System.out.println("After undo");
		System.out.println("Stack of Shapes");
		Object[][] pointsShapes6= convertStackToArray(factory.stackshapes);

		for(int i=0 ;i<pointsShapes6.length;i++) {
			for(int j=0 ;j<pointsShapes6[0].length;j++) {
				System.out.print(pointsShapes6[i][j]+"  ");
																		
			}
			System.out.println("********");
		}
		System.out.println("Stack of steps");
		
		Object[][] pointsShapes5= convertStackToArray(factory.stepsStack);
		for(int i=0 ;i<pointsShapes5.length;i++) {
			for(int j=0 ;j<pointsShapes5[0].length;j++) {
				System.out.print(pointsShapes5[i][j]+"  ");
																		
			}
			System.out.println("********");
		}
		
		factory.undo();System.out.println("After undo again");
		System.out.println("Stack of Shapes");
		Object[][] pointsShapes7= convertStackToArray(factory.stackshapes);

		for(int i=0 ;i<pointsShapes7.length;i++) {
			for(int j=0 ;j<pointsShapes7[0].length;j++) {
				System.out.print(pointsShapes7[i][j]+"  ");
																		
			}
			System.out.println("********");
		}
		System.out.println("Stack of steps");
		
		Object[][] pointsShapes8= convertStackToArray(factory.stepsStack);
		for(int i=0 ;i<pointsShapes8.length;i++) {
			for(int j=0 ;j<pointsShapes8[0].length;j++) {
				System.out.print(pointsShapes8[i][j]+"  ");
																		
			}
			System.out.println("********");
		}*/
		
		
		/*factory.redo();System.out.println("redooooooo");
		Object[][] pointsShapes2= convertStackToArray(factory.stackshapes);
		for(int i=0 ;i<pointsShapes2.length;i++) {
			for(int j=0 ;j<pointsShapes2[0].length;j++) {
				System.out.print(pointsShapes2[i][j]+"  ");
																		
			}
			System.out.println("********");
		}
		*/
		//System.out.println(((Shape)factory.stackshapes.peek()).isInclude(3, 15));
		/*System.out.println("size of the two stacks from the factory");
		System.out.println(factory.stackshapes.size());
		System.out.println(factory.stepsStack.size());*/
		//System.out.println("the steps stack after add");
		//factory.modify(3, 15, "color","white");
				//factory.undo();
				//factory.Delete(3, 15);
				//System.out.println(((Shape)factory.stackshapes.peek()).isInclude(3, -15));
		
		/*factory.undo();
		System.out.println(factory.stackshapes.size());
		System.out.println(factory.stepsStack.size());*/
		//Object[][] points =factory.move(4, 3, 9, 4);
		/*System.out.println("stack of shapes after move");
		for(int i=0 ;i<factory.stackshapes.size();i++) {
			for(int j=0 ;j<8;j++) {
				System.out.println(points[i][j]);
																		
			}
		}
		System.out.println("stack of steps after move");
		System.out.println("stack of steps after  move ="+factory.stepsStack.size());
		Object[][] pointsSteps2 = convertStackToArray(factory.stepsStack);
		for(int i=0 ;i<factory.stepsStack.size();i++) {
			for(int j=0 ;j<8;j++) {
				System.out.println(pointsSteps2[i][j]);
																		
			}
			System.out.println("********");
		}*/
		/*Object[][] pointsdel =factory.Delete(10, 2);
		System.out.println("stack of shapes after delete size ="+factory.stackshapes.size());
		for(int i=0 ;i<factory.stackshapes.size();i++) {
			for(int j=0 ;j<8;j++) {
				System.out.println(pointsdel[i][j]);
																		
			}
		}
		System.out.println("stack of steps after delete");
		System.out.println("stack of steps after  delete size ="+factory.stepsStack.size());
		Object[][] pointsStepsdel2 = convertStackToArray(factory.stepsStack);
		for(int i=0 ;i<factory.stepsStack.size();i++) {
			for(int j=0 ;j<9;j++) {
				System.out.println(pointsStepsdel2[i][j]);
																		
			}
			System.out.println("********");
		}
		Object[][] pointsRedo=factory.redo();
		System.out.println("size of the two stacks from the factory after the redo");
		System.out.println(factory.stackshapes.size());
		System.out.println(factory.stepsStack.size());
		System.out.println("stack of shapes after redo");
		for(int i=0 ;i<factory.stackshapes.size();i++) {
			for(int j=0 ;j<9;j++) {
				System.out.println(pointsRedo[i][j]);
																		
			}
		}
		System.out.println("stack of steps after redo");
		Object[][] pointsStepsre= convertStackToArray(factory.stepsStack);
		for(int i=0 ;i<factory.stepsStack.size();i++) {
			for(int j=0 ;j<9;j++) {
				System.out.println(pointsStepsre[i][j]);
																		
			}
			System.out.println("********");
		}
		
		/*
		System.out.println("size of the two stacks from the factory after the move");
		System.out.println(factory.stackshapes.size());
		System.out.println(factory.stepsStack.size());*/
		/*Object[][] pointsUndo=factory.undo();
		System.out.println("size of the two stacks from the factory after the undo");
		System.out.println(factory.stackshapes.size());
		System.out.println(factory.stepsStack.size());
		System.out.println("stack of shapes after undo");
		for(int i=0 ;i<1;i++) {
			for(int j=0 ;j<8;j++) {
				System.out.println(pointsUndo[i][j]);
																		
			}
		}
		System.out.println("stack of steps after undo");
		Object[][] pointsSteps= convertStackToArray(factory.stepsStack);
		for(int i=0 ;i<2;i++) {
			for(int j=0 ;j<8;j++) {
				System.out.println(pointsSteps[i][j]);
																		
			}
			System.out.println("********");
		}
		Object[][] pointsRedo=factory.undo();
		System.out.println("size of the two stacks from the factory after the second undo");
		System.out.println(factory.stackshapes.size());
		System.out.println(factory.stepsStack.size());
		System.out.println("stack of shapes after redo");
		for(int i=0 ;i<1;i++) {
			for(int j=0 ;j<8;j++) {
				System.out.println(pointsRedo[i][j]);
																		
			}
		}
		System.out.println("stack of steps after second undo");
		Object[][] pointsStepsre= convertStackToArray(factory.stepsStack);
		for(int i=0 ;i<2;i++) {
			for(int j=0 ;j<8;j++) {
				System.out.println(pointsStepsre[i][j]);
																		
			}
			System.out.println("********");
		}
		*/
		
	
		/*Circle c1 = new Circle(1,0,0,1,2,"red","10","circle");
		factory.stackshapes.push(c1);
		System.out.println(factory.stackshapes.size());*/
		
		/*Rectangle r = new Rectangle (1,6,6,0,0,"red","10","rectangle");
	   System.out.println(r.isInclude(4,3));*/
		
		/*Circle c1 = new Circle(1,3,2,3,-1,"red","10","circle");
		System.out.println(c1.isInclude(4,3));*/
		/*Triangle r = new Triangle (1, 0 , 0 , 3 , 5,"red","10","rectangle",false);
		   System.out.println(r.isInclude(1,1));*/
		
		 /*  ShapesFactory factory = new ShapesFactory();
			Shape c1=(Circle) factory.getShape(1,"circle",3,2,3,-1,"red","10");
			Shape c2=(Circle) factory.getShape(2,"circle",4,2,5,-1,"red","10");
			Object[][] pointsUndo=factory.undo();
			System.out.println("size of the two stacks from the factory after the undo");
			System.out.println(factory.stackshapes.size());
			System.out.println(factory.stepsStack.size());
			System.out.println("stack of shapes after undo");
			for(int i=0 ;i<1;i++) {
				for(int j=0 ;j<8;j++) {
					System.out.println(pointsUndo[i][j]);
																			
				}
			}
			System.out.println("stack of steps after undo");
			Object[][] pointsUndo1=convertStackToArray(factory.stepsStack);
			for(int i=0 ;i<2;i++) {
				for(int j=0 ;j<8;j++) {
					System.out.println(pointsUndo1[i][j]);
																			
				}
			}
			Object[][] pointsredo=factory.redo();
			System.out.println("size of the two stacks from the factory after the redo");
			System.out.println(factory.stackshapes.size());
			System.out.println(factory.stepsStack.size());
			System.out.println("stack of shapes after redo");
			for(int i=0 ;i<2;i++) {
				for(int j=0 ;j<8;j++) {
					System.out.println(pointsredo[i][j]);
																			
				}
			}
			System.out.println("stack of steps after redo");
			Object[][] pointsUndo11=convertStackToArray(factory.stepsStack);
			for(int i=0 ;i<2;i++) {
				for(int j=0 ;j<8;j++) {
					System.out.println(pointsUndo11[i][j]);
																			
				}
			}*/
			
}

public static  Object[][] convertStackToArray(StackMethods given) {
	//converts stack of shapes to array of objects to be sent to front end
	Object[][] arr= new Object[given.size()][9];
	//a copy from the stack given to pop from it 
	StackMethods s = new StackMethods();
	//int id,float x, float y, float x1, float y1, String color, String lineThickness
	int i=0;
	while(given.isEmpty()==false) {
		arr[i][0]=((Shape)given.peek()).id;
		arr[i][1]=((Shape)given.peek()).x;
		arr[i][2]=((Shape)given.peek()).y;
		arr[i][3]=((Shape)given.peek()).x1;
		arr[i][4]=((Shape)given.peek()).y1;
		arr[i][5]=((Shape)given.peek()).color;
		arr[i][6]=((Shape)given.peek()).lineThickness;
		arr[i][7]=((Shape)given.peek()).shapeType;
		arr[i][8]=((Shape)given.peek()).filled;
		i++;
		s.push(given.pop());
	}
	while(s.isEmpty()==false) {
		given.push(s.pop());
	}
	return arr;
}
}
