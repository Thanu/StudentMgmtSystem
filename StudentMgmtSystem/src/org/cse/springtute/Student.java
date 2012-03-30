package org.cse.springtute;

public class Student {

	private String firstName;
	private String lastName;
	private long regNumber;
	private String address;

        Student(String f,String l,long r,String a){
            firstName = f;
            lastName = l;
            regNumber = r;
            address = a;
        }

        public String getFirstName(){
            return firstName;
        }

        public String getLastName(){
            return lastName;
        }

        public long getRegNumber(){
            return regNumber;
        }

        public String getAddress(){
            return address;
        }
        
         public void setFirstName(String firstName){
            this.firstName = firstName;
        }

        public void setLastName(String lastName){
            this.lastName = lastName;
        }

        public void getRegNumber(long regNumber){
            this.regNumber = regNumber;
        }

        public void getAddress(String address){
            this.address = address;
        }

}
