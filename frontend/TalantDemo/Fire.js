import firebase from 'firebase'

class Fire {
    constructor () {
        this.init()
        this.checkAuth()
    }
    init = () => {
        if (!firebase.app.length) {
            firebabase.initializeApp({

            })
        }
    }
}