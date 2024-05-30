 class TrafficLight {
    public static void main(String[] args) {
        String Color = "yellow"; 

        switch (Color) {
            case "red":
                System.out.println("Stop! ");
                break;
            case "yellow":
                System.out.println("The light is yellow.");
                break;
            case "green":
                System.out.println("Go!");
                break;
            default:
                System.out.println("Invalid color. Please provide a valid traffic light color.");
        }
    }
}

                            
