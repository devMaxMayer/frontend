import { StatusBar } from 'expo-status-bar';
import {createAppContainer} from "react-navigation";
import {createStackNavigator} from "react-navigation-stack";
import React from 'react'
import { StyleSheet, Text, View, Image } from 'react-native'
import { Header } from './src/Header'
import { Profile } from './src/Profile'
import { Registration } from './src/Registration'
import { CurrentEvent } from './src/CurrentEvent'
import { Footer } from './src/Footer'
import LoginScreen from "./src/LoginScreen";
import ChatScreen from "./src/ChatScreen";

const AppNavigator = createStackNavigator(
    {
        Login: LoginScreen,
        Chat: ChatScreen
    },
    {
        headerMode: "none"
    }
);
export default createAppContainer(AppNavigator);
