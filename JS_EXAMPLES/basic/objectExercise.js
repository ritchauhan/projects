var person = {

    address : {
        "state" : "KA",
        "City" : "Bangalore",
        "country" : "India"
    },
    isFromState: function (state) {
        if(this.address.state === state) {
            console.log("person belongs to same state")
        } else {
            console.log("person belongs to some other state")
        }
    }
}

person.isFromState("KA")