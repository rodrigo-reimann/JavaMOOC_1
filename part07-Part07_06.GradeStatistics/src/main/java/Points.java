import java.util.ArrayList;


public class Points {
    private ArrayList<Integer> points;
    
    public Points () {
        this.points = new ArrayList<>();
    }
    
    public double pointAverage () {
        int sum = 0;
        
        for (int point : points) {
            sum += point;
        }
        return (double) sum / points.size();       
    }
    
    public double passingGradeAverage() {
        int sum = 0;
        int count = 0;
        
        for (int point : points) {
            if (point >= 50) {
                sum += point;
                count++;
            }
        }
        
        if (count > 0) {
            return (double) sum / count;
        } else {
            return 0;
        }
    }
    
    public double passPercentage() {
         int count= 0;
        
        for (int point : points) {
            if (point >= 50) {
                count++;
            }
        }
        
        return (double) 100 * count / points.size();      
    }
    
    public void gradeDistribution() {
        int [] gradeCounts = new int[6];
        
        for (int point : points) {
            if (point >= 0 && point <= 100) {               
                int grade = 0;
                if (point < 50) {
                    grade = 0;
                } else if (point < 60) {
                    grade = 1;
                } else if (point < 70) {
                    grade = 2;
                } else if (point < 80) {
                    grade = 3;
                } else if (point < 90) {
                    grade = 4;
                } else if (point >= 90) {
                    grade = 5;
                }
                
                gradeCounts[grade]++;
            }
        }       
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < gradeCounts[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
    }
    
    public void addPoints(int point) {
        if (point >= 0 && point <= 100) {
            points.add(point);
        }
    }
    
    
}
