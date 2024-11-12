import 'package:flutter/material.dart';
import 'package:table_calendar/table_calendar.dart';

class AppointmentBookingScreen extends StatefulWidget {
    @override
    _AppointmentBookingScreenState createState() => _AppointmentBookingScreenState();
}

class _AppointmentBookingScreenState extends State<AppointmentBookingScreen> {
    CalendarFormat _calendarFormat = CalendarFormat.month;

    @override
    Widget build(BuildContext context) {
        return Scaffold(
            appBar: AppBar(title: Text('Book an Appointment')),
        body: Column(
        children: [
        TableCalendar(
            focusedDay: DateTime.now(),
        firstDay: DateTime(2020),
        lastDay: DateTime(2030),
        calendarFormat: _calendarFormat,
        onFormatChanged: (format) {
        setState(() {
            _calendarFormat = format;
        });
    },
        ),
        Expanded(
            child: ListView.builder(
                itemCount: 10,
        itemBuilder: (context, index) {
        return ListTile(
            title: Text('Doctor $index'),
            subtitle: Text('Specialty $index'),
            onTap: () {
            // Book appointment logic
        },
        );
    },
        ),
        ),
        ],
        ),
        );
    }
}
