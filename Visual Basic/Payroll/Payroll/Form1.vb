Public Class Form1
    'Payroll Assignment-- Phillip Thames

    Private Sub GroupBox1_Enter(sender As Object, e As EventArgs) Handles GroupBox1.Enter

    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        'All of my variables 
        Dim employeeName As String
        Dim hoursWorked As Double
        Dim hourlyRate As Double
        Dim grossPay As Double
        Dim netPay As Double
        Dim stateTaxRate As Double
        Dim fedTaxRate As Double
        Dim ficaRate As Double
        Dim totFedTax As Double
        Dim totStateTax As Double
        Dim totFica As Double
        Dim numOfEmployees As Integer
        Dim totEmployees As Integer
        numOfEmployees = 0

        'prompts user to determine the # of employees to enter, Controls run time
        totEmployees = CInt(InputBox("Enter Total Number of Employees for Payroll"))


        Do While numOfEmployees < totEmployees
            'Gathers user input
            employeeName = InputBox("Enter Employee Name")
            hoursWorked = CDbl(InputBox("Enter Total Hours Worked"))
            hourlyRate = CDbl(InputBox("Enter Hourly Rate"))
            stateTaxRate = CDbl(InputBox("Enter State Tax Rate"))
            fedTaxRate = CDbl(InputBox("Enter Federal Tax Rate"))
            ficaRate = CDbl(InputBox("Enter FICA Tax Rate"))

            'Calculate gross pay and overtime
            If hoursWorked > 0 And hoursWorked <= 40 Then
                grossPay = hoursWorked * hourlyRate

            ElseIf hoursWorked > 40 Then
                grossPay = ((hoursWorked - 40) * (hourlyRate * 1.5)) + (40 * hourlyRate)
            End If
            'calculates taxs and net
            totStateTax = grossPay * stateTaxRate
            totFedTax = grossPay * fedTaxRate
            totFica = grossPay * ficaRate
            netPay = grossPay - (totFedTax + totStateTax + totFica)

            If (totFedTax + totStateTax + totFica) > grossPay Then

                MessageBox.Show("The Amount of With Holdings Exeeds Gross Pay")
            End If

            LstData.Items.Add(employeeName.ToString + "          " +
                                grossPay.ToString + "              " +
                                totStateTax.ToString + "              " +
                                totFedTax.ToString + "              " +
                                totFica.ToString + "              " +
                                netPay.ToString)
            numOfEmployees += 1

        Loop


    End Sub

    Private Sub ListBox1_SelectedIndexChanged(sender As Object, e As EventArgs) Handles LstData.SelectedIndexChanged

    End Sub

    Private Function lstOutput() As Object
        Throw New NotImplementedException
    End Function

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Me.Close()
    End Sub

    Private Sub Label2_Click(sender As Object, e As EventArgs) Handles Label2.Click

    End Sub
End Class
