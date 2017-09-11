public class Rectangle extends Shape {
        private int length;
        private int width;
        public Rectangle (String color, int length, int width){
            super(color);
            this.length=length;
            this.width=width;
        }
        /*override*/
        public String toString(){
            return"Rectangle[legth="+length+"width="+width+","+super.toString()+"]";
        }
        /*override*/
        public double getArea(){
            return length*width;
        }
    
}
