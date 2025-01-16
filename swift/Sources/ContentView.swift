import SwiftUI

struct ContentView: View {
    var body: some View {
        VStack {
            Text("Hello, World!")
                .padding()
            
            Button(action: {
                print("Button clicked")
            }) {
                Text("Click Me")
            }
            .padding()
        }
    }
}
