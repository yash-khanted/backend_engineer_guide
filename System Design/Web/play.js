function learn(){

    const person = {
        name: "yash",
        age: 24,
        profession: "developer",
        address: {
            city: "nellore",
            state: "AP"
        },
    
        print: function(){
                    console.log(this.name + 
                        person["age"] + 
                        person.address.city + 
                        person.address.state)
                }
    }

    person.print()
}

