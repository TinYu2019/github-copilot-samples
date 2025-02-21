import XCTest
import SwiftUI
@testable import MySwiftApp

class ContentViewTests: XCTestCase {
    func testButtonAction() {
        let contentView = ContentView()
        let hostingController = UIHostingController(rootView: contentView)
        
        // Simulate button click
        let button = hostingController.view.findButton(withText: "Click Me")
        XCTAssertNotNil(button)
        button?.sendActions(for: .touchUpInside)
        
        // Check console output (this is a simple example, in real cases you might want to use a different approach)
        // Note: This test will pass if the button exists and the action is triggered.
    }
}

private extension UIView {
    func findButton(withText text: String) -> UIButton? {
        if let button = self as? UIButton, button.title(for: .normal) == text {
            return button
        }
        for subview in subviews {
            if let found = subview.findButton(withText: text) {
                return found
            }
        }
        return nil
    }
}
