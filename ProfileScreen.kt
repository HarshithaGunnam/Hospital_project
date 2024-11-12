import 'package:flutter/material.dart';

class ProfileScreen extends StatelessWidget {
    @override
    Widget build(BuildContext context) {
        return Scaffold(
            appBar: AppBar(title: Text('My Profile')),
        body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
        children: [
        CircleAvatar(
            radius: 50,
        backgroundImage: NetworkImage('https://example.com/avatar.png'),
        ),
        SizedBox(height: 10),
        Text('Patient Name', style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold)),
        SizedBox(height: 5),
        Text('Medical History Summary', style: TextStyle(fontSize: 16)),
        // More details like prescriptions, upcoming appointments, etc.
        ],
        ),
        ),
        );
    }
}
