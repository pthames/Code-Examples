Public Class Form1
    'Assignment 3 Banking
    'Phillip Thames   ITCS 2231-051
    Private Sub Label1_Click(sender As Object, e As EventArgs) Handles Label1.Click

    End Sub

    Private Sub btnCalc_Click(sender As Object, e As EventArgs) Handles btnCalc.Click
        'Declaring variables
        Dim decChecks As Decimal   'Number of Checks used during month
        Dim decTotalFees As Decimal   'Total charges fro the month

        Try

            decChecks = CDec(txtChecks.Text) 'User input for the Checks used

            'Case statements to decide which calculation to use
            'based on the # of checks the user enters
            Select Case decChecks
                Case 1 To 20
                    decTotalFees = CDec(10 + (decChecks * 0.2))

                Case 20 To 39
                    decTotalFees = CDec(10 + (decChecks * 0.15))

                Case 40 To 59
                    decTotalFees = CDec(10 + (decChecks * 0.1))

                Case Is >= 60
                    decTotalFees = CDec(10 + (decChecks * 0.05))
            End Select

            txtFees.Text = decTotalFees.ToString("c")

        Catch ex As Exception
            'Error message if the user enters a negative #
            MessageBox.Show("Please enter a positive number.")
        End Try
    End Sub

    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click
        'Clears the fields
        txtChecks.Clear()
        txtFees.Clear()

    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        'Exits the program
        Me.Close()

    End Sub
End Class
