db.collection('Utilisateur').insertOne(
    {
        "login": "Dylan",
        "password": "{bcrypt}$2y$10$ms5Ubt0/Oi9TBJHOPbPi4O4Vkl9b1b7seinfmv19P6ydMVG.e1e1q",
        "role": "USER"
    }
)